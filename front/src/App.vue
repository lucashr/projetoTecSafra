<template>
  <header>
    <nav class="navbar navbar-expand-lg navbar-light">
      <div class="container-fluid">
        <img class="logoSafra" src="./assets/logo-safra-boa.png" width="250" height="70" />
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="#">Serviços</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Investimentos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Nossas Especialidades</a>
            </li>
            <li class="nav-item underline">
              <a class="nav-link" href="#">Sobre</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Ajuda</a>
            </li>
            <li>
            <button
              type="button"
              class="btn btn-outline-primary"
              v-on:click="navigateToHomePage()"
            >
              Voltar a Home Page
            </button>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
  <div>
    <div>
      <router-view/>
    </div>
  </div>
  <footer>
  
  </footer>
</template>

<script>

export default {
  name: 'App',
  methods: {
    navigateToHomePage() {
      this.$router.push('/')
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
nav.navbar{
  background-color: #EDEDED; 
}

button.btn{
    background: #C2B97F;
    color: #00003C;
    font-weight: bold;
    padding: 10px;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    cursor: pointer;
}

button.btn:hover {
  background: #8C805E;
  color:#00003C;
}

footer {
  background: #1E2044;
  height: 100px;
}
</style>
