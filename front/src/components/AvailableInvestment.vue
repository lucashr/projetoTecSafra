<template>
    <div>
      <img class="logoSafra" src="../assets/logo-safra.svg" width="200" height="150" />
        <div class="apresentacaoUsuario">
          Safra Smart Invest
          <br>
          Olá Carla!
        </div>
        
        <DataTable :value="dataClient" :rows="10" filterDisplay="menu"
        dataKey="id" :rowHover="true" class="p-datatable-dataclient"
        paginatorTemplate="FirstPageLink PrevPageLink PageLinks NextPageLink LastPageLink CurrentPageReport RowsPerPageDropdown" :rowsPerPageOptions="[10,25,50]"
        currentPageReportTemplate="Showing {first} to {last} of {totalRecords} entries" responsiveLayout="scroll">
            <template #header>
                 <div class="flex justify-content-center align-items-center cor-de-fundo">
                    <h5 class="m-0 tituloInformaDosInvestimentos">Informações dos Investimentos</h5>
                 </div>
            </template>
            
            <Column field="type" header="Type" sortable style="min-width: 14rem; ">
                <template #body="{data}">
                  <!-- <img src="../assets/NotacaoMonetaria.png" :class="'flag flag-' + data.type" width="30" />
                    <span class="image-text">{{data.type}}</span> -->
                    {{data.type}}
                </template>
            </Column>
            <Column field="minInvestMonths" header="Min. Invest Months" sortable style="min-width: 14rem">
                <template #body="{data}">
                  <img src="../assets/NotacaoMonetaria.png" :class="'flag flag-' + data.minInvestMonths" width="15" />
                    <span class="image-text">{{data.minInvestMonths}}</span>
                    <!-- {{data.minInvestMonths}} -->
                </template>
                
                <!-- <template #filter="{filterModel}">
                    <InputText type="text" v-model="filterModel.value" class="p-column-filter" placeholder="Search by name"/>
                </template> -->
            </Column>
            <Column field="totalAmount" header="Total Amount" sortable style="min-width: 14rem">
                <template #body="{data}">
                  <img src="../assets/NotacaoMonetaria.png" :class="'flag flag-' + data.totalAmount" width="15" />
                    <span class="image-text">{{data.totalAmount}}</span>
                    <!-- {{data.totalAmount}} -->
                </template>
                <!-- <template #filter="{filterModel}">
                    <InputText type="text" v-model="filterModel.value" class="p-column-filter" placeholder="Search by name"/>
                </template> -->
            </Column>
            <Column field="actualInterestRate" header="Actual Interest Rate" sortable style="min-width: 14rem">
                <template #body="{data}">
                  <img src="../assets/NotacaoMonetaria.png" :class="'flag flag-' + data.actualInterestRate" width="15" />
                    <span class="image-text">{{data.actualInterestRate}}</span>
                    <!-- {{data.actualInterestRate}} -->
                </template>
                <!-- <template #filter="{filterModel}">
                    <InputText type="text" v-model="filterModel.value" class="p-column-filter" placeholder="Search by name"/>
                </template> -->
            </Column>
            <Column field="safraInterestRate" header="Safra Interest Rate" sortable style="min-width: 14rem">
                <template #body="{data}">
                  <img src="../assets/NotacaoMonetaria.png" :class="'flag flag-' + data.safraInterestRate" width="15" />
                    <span class="image-text">{{data.safraInterestRate}}</span>
                    <!-- {{data.safraInterestRate}} -->
                </template>
                <!-- <template #filter="{filterModel}">
                    <InputText type="text" v-model="filterModel.value" class="p-column-filter" placeholder="Search by name"/>
                </template> -->
            </Column>
        </DataTable>
        
        <div class="novoCliente">
          <div>Quero abrir uma conta no Safra!</div>
          <br>
          <Button label="Clique aqui" class="btnCliqueAqui" />
        </div>
        
	</div>
</template>

<script>

export default {
  name: 'AvailableInvestment',
  data() {
    return {
      dataClient: null,
    }
  },
  mounted() {
    this.dataClient = [
      {type: 'TIPO 1', minInvestMonths: '12', totalAmount: '0.38', actualInterestRate: '0.14', safraInterestRate: '2.53'},
      {type: 'TIPO 2', minInvestMonths: '13', totalAmount: '0.66', actualInterestRate: '0.55', safraInterestRate: '1.78'},
      {type: 'TIPO 3', minInvestMonths: '14', totalAmount: '0.35', actualInterestRate: '0.29', safraInterestRate: '3.66'},
      {type: 'TIPO 4', minInvestMonths: '15', totalAmount: '0.88', actualInterestRate: '0.18', safraInterestRate: '5.77'},
      {type: 'TIPO 5', minInvestMonths: '16', totalAmount: '0.99', actualInterestRate: '0.05', safraInterestRate: '1.97'},
      {type: 'TIPO 6', minInvestMonths: '17', totalAmount: '1.02', actualInterestRate: '0.10', safraInterestRate: '8.00'},
    ];
  },
  computed: {
    
    showInvestmentTable() {
      return true;
    }
  },
  method: {
    // local para criação de metodos

    //Nome das colunas da tabela
    // chamada rest pro backend nodejs (fetch, axios)
    // type
    // minInvestMonths
    // totalAmount
    // actualInterestRate
    // safraInterestRate 

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss" scoped>

.p-button.p-button-secondary, .p-buttonset.p-button-secondary > .p-button, .p-splitbutton.p-button-secondary > .p-button {
  color: #ffffff;
  background: #64748B;
  border: 1px solid #64748B;
}

.apresentacaoUsuario {
  border: 1px solid black;
  width: 34%;
  position: relative;
  margin-bottom: 2%;
  margin-left: 32%;
}


.bordaTabela {
  border: 1px solid black;
}

.btnCliqueAqui {
  width: 16%;
  padding: 9px;
  background-color: #97adca;
  border-radius: 12px 12px 12px 12px;
  font-style: oblique;
}

.novoCliente {
  position: relative;
  right: 34%;
  margin-top: 5%;
}

.tituloInformaDosInvestimentos {
  padding: 15px;
}

.cor-de-fundo {
  background-color: #c2c2f2;
  margin-bottom: -3%;
  margin-top: -5%;
}

// #body {
//   background-color: #e3e3e3
// }

::v-deep(.p-column-header-content) {
  align-content: left;
  // margin-left: 50%;
}

// .p-column-header-content {
//   text-align: center;
//   background-color: rebeccapurple;
// }

.logoSafra {
  position: relative;
  right: 42%;
  margin-top: -7%;
}

::v-deep(.p-paginator) {
    .p-paginator-current {
        margin-left: auto;
    }
}

::v-deep(.p-progressbar) {
    height: .5rem;
    background-color: #D8DADC;

    .p-progressbar-value {
        background-color: #607D8B;
    }
}

::v-deep(.p-datatable.p-datatable-dataclient) {
    .p-datatable-header {
        padding: 1rem;
        text-align: center;
        font-size: 1.5rem;
    }

    .p-paginator {
        padding: 1rem;
    }

    .p-datatable-thead > tr > th {
        text-align: center;
        background-color: rgb(106, 163, 238);
        padding: 0.5rem;
    }

    .p-datatable-tbody > tr > td {
        cursor: auto;
        background-color: rgb(199, 209, 211);
        padding: 5px;
        font-family: Montserrat,-apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,"Noto Sans",sans-serif;
        text-align: initial;
    }

    .p-dropdown-label:not(.p-placeholder) {
        text-transform: uppercase;
    }

    
}
</style>