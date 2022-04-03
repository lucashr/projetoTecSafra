import {createRouter, createWebHistory} from 'vue-router';

import AvailableInvestment from "@/components/AvailableInvestment"
import FirstPage from "@/components/FirstPage"

const routes = [
    {
        path: '/investment',
        name: 'AvailableInvestment',
        component: AvailableInvestment
    },
    {
        path: '/',
        name: 'FirstPage',
        component: FirstPage
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes: routes
});

export default router;