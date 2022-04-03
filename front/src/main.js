import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import DataTable from 'primevue/datatable';
import Column from 'primevue/column';
import ColumnGroup from 'primevue/columngroup';     //optional for column grouping
import Row from 'primevue/row';                     //optional for row

import Button from 'primevue/button';

import 'bootstrap/dist/css/bootstrap.css'
import "bootstrap/dist/js/bootstrap.js";

createApp(App)
    .use(router)
    .component('DataTable', DataTable)
    .component('Column', Column)
    .component('ColumnGroup', ColumnGroup)
    .component('Row', Row)
    .component('Button', Button)
    .mount('#app')
