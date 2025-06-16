# ProjetoMusica

🎵 Projeto: Sistema de Gerenciamento de Músicas e Podcasts — Java POO
Este projeto foi desenvolvido com base nos conceitos de Programação Orientada a Objetos (POO) usando a linguagem Java. Nele, é possível simular a reprodução de músicas e podcasts, com funcionalidades como curtir, avaliar e exibir informações detalhadas. O sistema também aplica herança, polimorfismo, encapsulamento e uso de interfaces.

🧱 Estrutura do Projeto
O projeto está dividido em pacotes e classes que representam os diferentes componentes do sistema:

📁 Pacote modelos:
TodosMusica (superclasse)
Classe base que representa qualquer tipo de áudio (música ou podcast), contendo:

Atributos como título, duração, número de reproduções, curtidas, classificação.

Métodos para curtir (curte()), reproduzir (reproduz()), adicionar notas (totalClassificacao()), e exibir detalhes (exibirFicha()).

Musicas (subclasse)
Representa uma música, herda de TodosMusica e adiciona:

cantor e gênero musical.

Sobrescreve o método getClassificacao() para retornar 10 se tiver mais de 2000 curtidas, senão 7.

PodCast (subclasse)
Representa um podcast, com atributos extras como:

apresentadores e entrevistado.

Implementa a interface Classifcou, que permite avaliar a média da nota e emitir uma mensagem de acordo com o resultado.

Classifcou (interface)
Interface funcional com um único método:

valiacao(double media): usado para classificar um podcast como "baixa", "média" ou "alta".

Titulo
Classe que "avalia" se o conteúdo incluído é popular com base na classificação:

Se a classificação média ≥ 9 → "sucesso absoluto"

Senão → "um dos que todo mundo está curtindo"

📁 Pacote Principal:
Principal (classe main)
Executa o sistema com os seguintes passos:

Cria objetos de músicas (Musicas) e podcast (PodCast).

Define dados como título, cantor, duração e gênero.

Simula reproduções e curtidas com loops for.

Adiciona avaliações (notas) com totalClassificacao().

Usa a classe Titulo para avaliar o conteúdo.

Exibe todas as informações detalhadas com exibirFicha().

💡 Funcionalidades Demonstradas
✅ Criação de objetos com atributos personalizados

✅ Simulação de curtidas e reproduções

✅ Avaliação de conteúdo por notas

✅ Análise de popularidade com mensagens automáticas

✅ Exibição de ficha técnica com dados calculados (ex: média da classificação)

✅ Uso de herança, sobrescrita de métodos e interface
