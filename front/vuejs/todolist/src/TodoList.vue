<template>
  <!--<div id="app">-->
  <!--<img src="./assets/logo.png">-->
  <!--<HelloWorld/>-->
<!--</div>-->
  <div>
    <div>
      <input v-model="inputValue"/>
      <button @click="handleSubmit">提交</button>
    </div>
    <ul>
      <todo-item
        v-for="(item, index) of list"
        :content="item"
        :key="index"
        :index="index"
        @delete="handleDelete"
      >
      </todo-item>
    </ul>
  </div>
</template>

<script>

import TodoItem from './components/TodoItem'
// import HelloWorld from './components/HelloWorld'
//
// export default {
//   name: 'App',
//   components: {
//     HelloWorld
//   }
// }

export default {
  components: {
    'todo-item': TodoItem
  },
  data: function () {
    return {
      inputValue: '',
      list: []
    }
  },
  methods: {
    handleSubmit () {
      this.list.push(this.inputValue)
      this.inputValue = ''
    },
    handleDelete (index) {
      this.list.splice(index, 1)
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
