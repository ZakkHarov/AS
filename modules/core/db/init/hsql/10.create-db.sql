-- begin AS_PRODUCT
create table AS_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BRAND varchar(255),
    CODE varchar(255),
    NAME varchar(255),
    ALIAS varchar(255),
    MULTIPLICITY double precision,
    --
    primary key (ID)
)^
-- end AS_PRODUCT
-- begin AS_PRODUCT_PRICE
create table AS_PRODUCT_PRICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end AS_PRODUCT_PRICE
