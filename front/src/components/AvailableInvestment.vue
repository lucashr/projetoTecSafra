<template>
  <div v-show=showInvestmentTable>
    Tabela de investimentos
  </div>
</template>

<script>
export default {
  name: 'AvailableInvestment',
  data() {
    return {
      
    }
  },
  mounted() {
    console.log("oi")
  },
  computed: {
    showInvestmentTable() {
      return true;
    }
  },
  method: {
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
<style scoped>

</style>
