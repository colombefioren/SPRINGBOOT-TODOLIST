CREATE TABLE todo (
  id              SERIAL PRIMARY KEY,
  title           VARCHAR(120)  NOT NULL,
  description     VARCHAR(1000) NOT NULL,
  start_datetime  TIMESTAMPTZ   NOT NULL,
  end_datetime    TIMESTAMPTZ   NULL,
  done            BOOLEAN       NOT NULL DEFAULT FALSE
);

CREATE INDEX IF NOT EXISTS idx_todo_done ON todo(done);
