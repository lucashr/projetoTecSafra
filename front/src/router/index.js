import {createRouter, createWebHistory} from 'vue-router';

import AvailableInvestment from "@/components/AvailableInvestment"

const routes = [
    {
        path: '/',
        name: 'AvailableInvestment',
        component: AvailableInvestment
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes: routes
});

export default router;