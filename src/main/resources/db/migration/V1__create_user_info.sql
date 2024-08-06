-- Criação das tabelas
CREATE TABLE IF NOT EXISTS subscriptions_type (
    subscriptions_type_id SERIAL PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    access_months INTEGER,
    price NUMERIC(10,2) NOT NULL,
    product_key VARCHAR(255) UNIQUE
    );

CREATE TABLE IF NOT EXISTS user_type (
    user_type_id SERIAL PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS users (
    users_id SERIAL PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(255) NOT NULL UNIQUE,
    cpf VARCHAR(255) NOT NULL UNIQUE,
    dt_subscription DATE NOT NULL,
    dt_expiration DATE NOT NULL,
    user_type_id INTEGER,
    subscriptions_type_id INTEGER,
    FOREIGN KEY (user_type_id) REFERENCES user_type(user_type_id),
    FOREIGN KEY (subscriptions_type_id) REFERENCES subscriptions_type(subscriptions_type_id)
    );

CREATE TABLE IF NOT EXISTS user_payment_info (
    user_payment_info_id SERIAL PRIMARY KEY,
    card_number VARCHAR(255) NOT NULL UNIQUE,
    card_expiration_month INTEGER NOT NULL,
    card_expiration_year INTEGER NOT NULL,
    card_security_code VARCHAR(255) NOT NULL,
    price NUMERIC(10,2) NOT NULL,
    instalments INTEGER NOT NULL,
    dt_payment DATE NOT NULL,
    user_id INTEGER,
    FOREIGN KEY (user_id) REFERENCES users(users_id)
    );

-- Inserção dos dados
INSERT INTO subscriptions_type (Nome, access_months, price, product_key)
VALUES
    ('PLANO MENSAL', 1, 75.00, 'MONTH22'),
    ('PLANO ANUAL', 12, 697.00, 'YEAR22'),
    ('PLANO VITALICIO', NULL, 1497.00, 'PERPETUAL22');

INSERT INTO user_type (Nome, description)
VALUES
    ('PROFESSOR', 'Professores da plataforma - cadastro administrativo'),
    ('ADMINISTRADOR', 'Administrado da plataforma - cadastro administrativo'),
    ('ALUNO', 'Aluno da plataforma - cadastro via fluxo normal');
