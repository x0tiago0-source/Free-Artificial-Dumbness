# Free Artificial Dumbness

Free Artificial Dumbness é uma aplicação para Android concebida para ajudar os utilizadores a reduzir a exposição indesejada a funcionalidades de Burrice Artificial (Chatsbots) integradas em aplicações de redes sociais de forma forçada Permite ao utilizador ativar ou desativar o bloqueio de forma independente para cada aplicação compatível.

> Estado do repositório: esta documentação descreve a implementação local completa do Android que está a ser preparada para o projeto. O repositório do GitHub contém, neste momento, a estrutura inicial provisória, pelo que o código-fonte da aplicação deve ser sincronizado antes de se poder esperar que o projeto remoto seja compilado e funcione exatamente como aqui descrito.

## Indice

- [Funcionalidades](#features)
- [Como Funciona](#how-it-works)
- [Requisitos](#requirements)
- [Instalação](#installation)
- [Capturas de Ecrã](#screenshots)
- [Limitações Conhecidas](#known-limitations)
- [Contribuição](#contributing)
- [Privacidade](#privacy)
- [Liçensa](#license)

## Funcionalidades

A implementação local atual disponibiliza um botão de ativação/desativação independente para cada pacote suportado:

- WhatsApp (`com.whatsapp`): Meta AI search, shortcut and conversation surfaces.
- Instagram (`com.instagram.android`): Meta AI surfaces, direct-message entry points and Support AI.

A aplicação inclui ainda:

- A status dashboard showing the Accessibility Service state.
- Independent per-app toggles.
- A locally stored summary and timestamp for the latest detected block.
- Contextual blocking behaviour for Instagram and WhatsApp.
- A local blocking overlay for general supported matches.
- Heuristic matching using visible text, content descriptions, state descriptions and view IDs.

The implementation does not currently include iOS support, account synchronisation, cloud backup, configurable inspirational messages or a complete historical statistics dashboard.

## Como Funciona

1. O utilizador ativa o Serviço de Acessibilidade do Android a partir das definições do sistema.
2. O serviço monitoriza apenas os pacotes de aplicações suportados.
3. Analisa a árvore de acessibilidade exposta pela janela ativa.
4. O texto e as descrições são comparados com as regras ativadas para essa aplicação.
5. Quando é detetada uma superfície de IA suportada, o serviço navega para trás.
6. O resumo mais recente dos bloqueios e o registo de data e hora são armazenados localmente no dispositivo.

O serviço não automatiza gestos. Utiliza `GLOBAL_ACTION_BACK` quando é adequado recorrer a uma ação contextual de «voltar» e, nos restantes casos, apresenta a sobreposição definida em `app/src/main/res/layout/blocking_overlay.xml`.

## Requisitos

- Android Studio.
- JDK 17.
- Android SDK com a API 34 disponível.
- Android 10 / API 29 ou mais recente.
- A permissão do Serviço de Acessibilidade ativada no dispositivo de teste.
- As aplicações de redes sociais compatíveis instaladas para testes em dispositivos reais.

A configuração local do Gradle utiliza o Kotlin 1.9.24, o Android Gradle Plugin 8.4.2, o SDK de compilação 34, o SDK de destino 34 e o SDK mínimo 29.

## Instalação

1. Procure a Secção Downloads
2. Baixe a última .apk
3. Transfira a .apk usando Blip / Airdrop para o Telemóvel / Celular caso esteja no PC.
3. Instale a .apk no Android
4. Aceda as Definições da Aplicação & Ative Definições Restritas
5. Ative o Serviço da Aplicação nas Definições de Acessibilidade
6. Ative os Toogles que você deseja testar.

O serviço depende da árvore de acessibilidade disponibilizada por aplicações de terceiros. Teste cada regra com as versões exatas dessas aplicações que pretende suportar.

## Capturas de Ecrã

Serão adicionadas capturas de ecrã à pasta `assets/screenshots/` após a interface ter sido testada num dispositivo real. O conjunto previsto é o seguinte:

Página inicial/painel de controlo com botões de ativação/desativação e atalho para as configurações de acessibilidade.

## Limitações Conhecidas

- A deteção é heurística e depende do texto, das descrições e da estrutura de visualização apresentados por cada aplicação alvo.
- As aplicações de terceiros podem alterar as suas interfaces sem aviso prévio, o que poderá exigir novas regras ou heurísticas.
- Atualmente, têm-se observado falhas no Serviço de Acessibilidade em dispositivos HyperOS. Os relatórios relativos a outras distribuições Android devem incluir detalhes completos sobre o dispositivo e o sistema operativo, para que possam ser investigados separadamente.


## Contribuição

Leia [CONTRIBUTING.md](CONTRIBUTING.md) antes de abrir um issue ou um pull request.

## Privacidade

Leia [docs/PRIVACY_POLICY.md](docs/PRIVACY_POLICY.md). A implementação atual privilegia o uso local: não possui sistema de contas, backend, SDK de análise nem autorizações de rede.

## Licença

A licença do repositório está definida em [LICENSE](LICENSE).
