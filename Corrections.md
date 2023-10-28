    Исправления v.1:

    1. В классе Person добавлена аннотация @IdClass;
    2. В классе Person удалена аннотация @Data над сущностями;
    3. В классе Person использована аннотация @Column для поддержки названия колонок с нижним подчеркиванием;
    4. Классы Controller, Repository, Service переименованы в GetController, GetRepository, GetService. К классам
    GetRepository, GetService применены аннотации @Service, @Repository.

    Исправления v.2:

    1. Поля l24-l26 исправлены в соотвествии со стелем camelCase;
    2. В @IdClass передан созданный PersonId класс.