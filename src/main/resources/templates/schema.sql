CREATE TABLE IF NOT EXISTS public.transaction2
(
    user_id integer NOT NULL,
    transaction_number Serial,
    transaction_type character varying(2) NOT NULL,
    transaction_amount bigint NOT NULL,
    date timestamp without time zone,
    PRIMARY KEY (transaction_number, user_id)
);