package com.leiline.flink.sql;

import org.apache.flink.table.api.StreamTableEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;

/***
 * structure of table api and sql programs
 */
public class Structure {

    public void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tableEnv = TableEnvironment.getTableEnvironment(env);

        tableEnv.registerTable("table1", ...);
        tableEnv.registerTableSource("table2", ...);
        tableEnv.registerTableInternal("table3", ...);

        tableEnv.registerTableSink("outputTable", ...);

        Table sqlResult = tableEnv.scan("table1")
                .select("...");

        Table tapiResult = tableEnv.sqlQuery("...");

        tapiResult.insertInto("outputTable");
        env.execute();


    }
}
