# Bem vindo ao dnd5api consumer!

Criei essa biblioteca simples com o proposito de consumir uma API do RPG de mesa D&D, existe varias funcionalidades que você pode usar, tanto pegar informações como a vida de um monstro ou até mesmo propriedades de uma classe, com essa biblioteca você consegue de forma facil e simples pegar informações e tratar elas de acordo com o seu querer, a biblioteca tem uma funcionalidade de gerar um personagem, você coloca todas informações necessarias para criação, e ele pega todas informações diretamente da API baseado nas propriedades que você setou.

```maven
<dependency>
  <groupId>io.github.murilonerdx</groupId>
  <artifactId>ded</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

Não esqueça de configurar um arquivo chamado resources/dnd.properties com as configurações do site para fazer as requisições
```maven
dnd.api.server=https://www.dnd5eapi.co/
```


# Lista de informação referente a uma propriedade
Existe alguns tipos de requisições no qual ele retorna uma lista de propriedades baseado no item escolhido, por exemplo **AbilityScore.get()** ele é responsavel de trazer uma requisição do tipo RequestDefaultResource que dentro dele é contido um contador da quantidade de items referente a AbilityScore e a lista de resultados que são os items. Alguns exemplos abaixo:
```java
RequestDefaultResource requestDefaultResource1 = AbilityScore.get();
RequestDefaultResource requestDefaultResource2 = Alignment.get();
RequestDefaultResource requestDefaultResource3 = Language.get();
RequestDefaultResource requestDefaultResource4 = Proficiency.get();
RequestDefaultResource requestDefaultResource5 = Skill.get();
RequestDefaultResource requestDefaultResource6 = Classe.get();
RequestDefaultResource requestDefaultResource16 = Equipment.get();
RequestDefaultResource requestDefaultResource17 = Feat.get();
RequestDefaultResource requestDefaultResource18 = Monster.get();
RequestDefaultResource requestDefaultResource9_1 = Spell.getAll();
```



O resultado dessa requisição tem como objeto **RequestDefaultResource**
```java
private BigDecimal count;  
private List<DefaultDataAPI> results;
```
O resultado dessa requisição tem como objeto **DefaultDataAPI**
```java
private String index;  
private String name;  
private String url;
```

## DefaultDataAPI

A requisição como padrão trás informações com o corpo como index, name, e url. 
* index =  nome do item ou propriedade [ Padrão para URL]
* name =  nome do item ou propriedade
* url = buscar o index do item diretamente

## Padrão List

Existe outro tipo padrão para requisições especificas, para mais informações entrar nas configurações da classe do item buscado.

Não são todos os items que retornam lista, pois a requisição do site oficial do dnd5api não dá suporte para stream, para lançamentos futuros talvez seja adicionado essas alterações de list para todos os items. Alguns exemplos abaixo para List referenciando o item com o **.get()**

```java
List<SpellCasting> requestDefaultResource7 = SpellCasting.get();
List<SubClass> requestDefaultResource8 = SubClass.get();
List<Spell> requestDefaultResource9 = Spell.get();
List<Feature> requestDefaultResource10 = Feature.get();
List<Proficiencies> requestDefaultResource11 = Proficiencies.get();
List<Level> requestDefaultResource12 = Level.get();
List<Condition> requestDefaultResource13 = Condition.get();
List<Damage> requestDefaultResource14 = Damage.get();
List<MagicSchool> requestDefaultResource15 = MagicSchool.get();
```
## Pegar item por index

Para pegar um item da seleção baseado em uma propriedade especifica, você pode usar o item **.getIndex()**
pegando apenas a informação referente aquela informação setada. Alguns exemplos abaixo:

**AbilityScore.getIndex(AbilityScoreType.charisma)** : Vai pegar apenas a AbilityScore com a propriedade charisma.

Todos seguem a mesma estrutura, nem todos tem a propriedade para selecionar de acordo com um **Enum** com todas propriedades referentes aquele item, alguns items são do tipo String como por exemplo:
> Proficiency proficiency = Proficiency.getIndex("medium-armor");

Caso não saiba o nome exato da propriedade daquele item referenciado, você pode usar **Proficiency.get()** para pegar todas as propriedades existentes desse item.
```java
AbilityScore ability_score = AbilityScore.getIndex(AbilityScoreType.charisma);
Alignment alignment = Alignment.getIndex(AlignmentType.CE);
Language language = Language.getIndex(LanguageType.draconic);
Proficiency proficiency = Proficiency.getIndex("medium-armor");
Skill skill = Skill.getIndex(SkillType.history);
Classe classe = Classe.getIndex(ClasseType.monk);
Condition condition = Condition.getIndex(ConditionType.blinded);
Damage damage_types = Damage.getIndex(DamageType.cold);
SpellHability spell_hability = SpellHability.getIndex("sacred-flame");
SpellCasting spell_casting = SpellCasting.getIndex(SpellCastingType.druid);
SubClass sub_class = SubClass.getIndex(ClasseType.druid);
Spell spell = Spell.getIndex(ClasseType.ranger);
Feature feature = Feature.getIndex(SpellCastingType.wizard);
Object feature2 = Feature.getRuleIndex("action-surge-1-use");
Proficiencies proficiencies = Proficiencies.getIndex(SpellCastingType.warlock);
MagicSchool magic_schools = MagicSchool.getIndex(MagicSchoolType.abjuration);
EquipmentCategory equipment = EquipmentCategory.getIndex("ammunition");
MagicItem magic_item = MagicItem.getIndex("ammunition");
WeaponProperty weapon_property = WeaponProperty.getIndex(WeaponPropertyType.ammunition);
Feat feat = Feat.getIndex("grappler");
MonsterFull monster = Monster.getIndex("aboleth");
Race races1 = Race.getIndex(RaceType.half_elf);
RequestDefaultResource races2 = Race.getIndexSubraces(RaceType.half_elf);
RequestDefaultResource races3 = Race.getIndexProficiencies(RaceType.half_elf);
RequestDefaultResource races4 = Race.getIndexTraits(RaceType.half_elf);
Rule ruleIndex = Rule.getIndex(RuleType.using_ability_scores);
Rule ruleSection = Rule.getIndexSection(RuleSectionTypes.damage_and_healing)
```


## Dados especificos para level
Sendo ele SpellCasting como um padrão para varias requisições, você pode consultar a propriedade referente a o item e logo em seguida o level que quer pegar essa propriedade relacionada.

O Level tem como base uma subclasse no que você coloca a classe principal e a subclasse para ele pegar a referencia desse item baseada nessas duas informações.
```java
Level level = Level.getIndex(SpellCastingType.wizard, 5);
List<Level> level2 = Level.getSubclass(ClasseType.rogue, SpellCastingType.cleric);
```

## Propriedade especifica para search

Dois items especificos no qual existe uma dificuldade maior de achar seu identificadores para a propriedade foi feito um search no qual você consegue buscar pelo nome e ele trás todos items referentes aquilo digitado, segue o exemplo:

```java
List<DefaultDataAPI> list_proficincy = Proficiency.searchProficiency("ate");
List<Classe> list_classe = Classe.searchClasse(ClasseType.wizard);
```

# Gerar configurações baseados em propriedades

Você pode criar uma pacote no qual consegue criar personagens com varias configurações, o modelo padrão que pode ser utilizado é seguindo o seguinte esquema.
Não precisa extends em nenhuma outra classe, apenas colocar a anotação acima de seu modelo, com todas as propriedades que quer referenciar ao personagem.

```java
@GenerateHero(name = "Murilo", _level = 1, classe = ClasseType.bard, ability_score = AbilityScoreType.charisma, alignment = AlignmentType.CE, feature = SpellCastingType.druid, level = SpellCastingType.druid, proficiency = "medium-armor", proficiencies = SpellCastingType.druid, skill = SkillType.arcana, spell = ClasseType.paladin, spell_casting = SpellCastingType.wizard, sub_classe = ClasseType.wizard, language = LanguageType.draconic)
public class Murilo {
}
```
É possivel pegar as informações desse personagem usando a classe **Gen** que você consegue pegar as informações referenciadas a esse modelo. 
Obs: nem todas as propriedades podem ser setadas, apenas aquelas que o personagem pode ter dominio.

Exemplo abaixo de como pegar uma informação especifica do seu modelo.
Fazendo um (CAST) do objeto que quer pegar junto com o item e seu modelo, assim ele consegue auto referenciar e pegar a informação especifica desse modelo.

```java
AbilityScore ability_score = (AbilityScore) Gen.get(AbilityScore.class, Murilo.class);
Language language = (Language) Gen.get(Language.class, Murilo.class);
Classe classe = (Classe) Gen.get(Classe.class, Murilo.class);
Alignment alignment = (Alignment) Gen.get(Alignment.class, Murilo.class);
Feature feature = (Feature) Gen.get(Feature.class, Murilo.class);
Level level = (Level) Gen.get(Level.class, Murilo.class);
Proficiencies proficiencies = (Proficiencies) Gen.get(Proficiencies.class, Murilo.class);
Skill skill = (Skill) Gen.get(EPV.SKILL.getType(), Murilo.class);
Spell spell = (Spell) Gen.get(Spell.class, Murilo.class);
SpellCasting spell_casting = (SpellCasting) Gen.get(SpellCasting.class, Murilo.class);
SubClass sub_class = (SubClass) Gen.get(SubClass.class, Murilo.class);
```
Caso não tenha paciência ou queira pegar todas as informação de uma vez só, você pode utilizar o exemplo abaixo:

Hero tem todas as propriedades, e você apenas passa seu modelo e ele já auto referencia todas as suas propriedades em uma classe modelo que pode ser consumida ou tratada.
```java
Hero hero = Gen.getHeroProperties(Murilo.class);
```

Existem outras funcionalidades que serão adicionadas para melhor consumo de items e propriedades, como por exemplo, adicionar mais bases para o modelo padrão gerar, atualizar os items de result para uma lista que pode usar facilmente com stream, método customizavel para adicionar propriedades de items no modelo padrão do personagem, documentação das classes, modelos e anotações, e outras funcionalidades que ainda podem ser pensadas.


