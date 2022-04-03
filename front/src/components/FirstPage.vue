
<template>
  <body>
    <div class="body"> 
      <div class="panel">
        <h3 style="font-weigth: bold"> Safra Boa! </h3>
        <p>Vamos aumentar sua chance de ter um melhor investimento?  <br>
          Compartilhando dados de outros bancos com o Safra Boa! Você terá as melhores oportunidades de ofertas de todos os serviços bancários mais atualizados no mercado em suas mãos de maneira rápida e simples. <br>
          Através da sua permissão, seus dados estarão totalmente seguros com a gente e esse vínculo é passível de cancelamento em qualquer hora que você quiser.<br> Te mostraremos tudo com muita transparência, do jeito que você merece. <br>
          No Safra Boa! Te ajudamos a revolucionar o seu jeito de investir, trazendo confiança e solidez que são marcas registradas do Safra.
        </p>
        
        <button
          type="button"
          class="btn btn-outline-primary"
          v-on:click="navigateToInvestmentTable()"
        >
          Aceitar e compartilhar
        </button>
      </div>
    </div>  
  </body>
  
</template>

<script>
export default {
  name: 'FirstPage',
  data() {
    return {
    }
  },
  methods: {
    navigateToInvestmentTable() {
      this.$router.push('/investment')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
*{
  color: #00003C;

}

.body {
  background-image: url('../assets/safra-bg2.jpg');
  height: 1000px;
  display: flex;
  align-items: center;
  justify-content: center;
}

.panel{
    background: #EDEDED;
    position: relative;
    padding: 20px;
    margin-top: 20px;
    width: 50%;
    height: 40%;
    border-radius: 8px;
    border: 5px;
    text-align: center;
    font: 14px;
}
button {
    background: #C2B97F;
    color: #00003C;
    font-weight: bold;
    padding: 10px;
    border: none;
    border-radius: 4px;
    font-size: 12px;
    cursor: pointer;
}
button:hover {
  background: #8C805E;
  color:#00003C;
}


</style>
