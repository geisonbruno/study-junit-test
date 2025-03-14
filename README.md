## Curso: Testes com JUnit 5 Mockito e Spring Boot (REST APIs)

Link: Link: https://www.udemy.com/course/testes-com-junit-5-mockito-e-spring-boot-rest-apis/

URL do deploy: https://study-junit-test-ae55c7162708.herokuapp.com

### 📌 Dependência para Testes no Spring Boot

O Spring Boot Starter Test (spring-boot-starter-test) é um starter do Spring Boot que inclui, de forma automática, todas as bibliotecas necessárias para testes unitários e de integração em projetos Spring. Isso facilita a configuração do ambiente de testes, pois não precisamos adicionar manualmente bibliotecas como JUnit e Mockito.
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

### 🔹JUnit 5 – Anotações Principais:

@Test → Indica um método de teste. No JUnit 5, não possui atributos extras, pois extensões utilizam suas próprias anotações.
Métodos anotados são herdáveis, salvo substituições.

@BeforeEach / @AfterEach →  Executam código antes e depois de cada teste.

@BeforeAll / @AfterAll →  Executam código antes e depois de todos os testes da classe.

### 🔹Outras Anotações Úteis:

@DisplayName("Nome do teste") → Define um nome descritivo para melhor legibilidade.

@Disabled → Desativa um teste temporariamente.

@RepeatedTest(5) → Executa o mesmo teste múltiplas vezes.

@ParameterizedTest → Permite rodar testes com diferentes entradas.

@Tag("categoria") → Categoriza testes para execução seletiva.

### 🔹 Mockito – Injeção e Mocks:

@InjectMocks → Cria uma instância da classe em teste e injeta os mocks de suas dependências automaticamente. Útil quando se testa a classe em si, e não suas dependências.

Mockito, permite criar mocks (objetos simulados) para testar dependências externas sem precisar de implementações reais.

💡 Dica: Sempre que estiver testando apenas a classe em foco (e não suas dependências), use @InjectMocks. 

