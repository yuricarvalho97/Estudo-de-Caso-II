# Estudo-de-Caso-II
Repositório para a atividade de Estudo de Caso II da disciplina de Padrões de Projeto.

### Problema
  <p>O problema da solução oferecida anteriormente é que adicionar novas aplicações web e temas à hierarquia irá fazê-la crescer de forma exponencial. Por exemplo, para adicionar uma aplicação de catálogo de músicas vai ser necessário introduzir duas subclasses, uma para cada tema. Quanto mais aplicações forem adicionadas, pior isso vai ficar.</p>

### Solução
  <p>O padrão Bridge pode resolver esse problema ao trocar de herança para composição do objeto. Ou seja, extrai uma das dimensões em uma hierarquia de classe separada, para que as classes originais possam referenciar um objeto da nova hierarquia, ao invés de ter todos os os seus comportamentos dentro de uma classe.</p>

   <p>Seguindo essa lógica, é possível extrair o código relacionado a tema em sua própria classe com duas subclasses: Light e Dark. A classe aplicação então ganha um campo de referência apontando para um dos objetos de tema. Essa referência vai agir como uma ponte entre as classes Tema e Aplicação. Dessa forma, para adicionar novos temas não será mais necessário mudar a hierarquia da Aplicação  e vice-versa.</p>



# Modelo da nova solução: 
![Estudo de Caso II](https://user-images.githubusercontent.com/75703602/115297107-2ff5b280-a132-11eb-9c75-3aeb002aec23.jpeg)

