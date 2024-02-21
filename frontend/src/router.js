
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BoundedContext655AManager from "./components/listers/BoundedContext655ACards"
import BoundedContext655ADetail from "./components/listers/BoundedContext655ADetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/boundedContext655s/as',
                name: 'BoundedContext655AManager',
                component: BoundedContext655AManager
            },
            {
                path: '/boundedContext655s/as/:id',
                name: 'BoundedContext655ADetail',
                component: BoundedContext655ADetail
            },




    ]
})
