-- View: public.v_geografia

-- DROP VIEW public.v_geografia;

CREATE OR REPLACE VIEW public.view_geografia_global
 AS
 SELECT a.id AS id_localidade,
    a.nome AS localidade,
    a.ilha AS id_ilha,
    b.nome AS ilha,
    c.nome AS concelho,
    a.concelho AS id_concelho,
    d.nome AS freguesia,
    a.freguesia AS id_freguesia,
    e.nome AS pais,
    a.pais AS id_pais,
    f.nome AS zona,
    a.zona AS id_zona,
    a.nacionalidade
   FROM global_geografia a
     LEFT JOIN global_geografia b ON a.ilha::text = b.id::text
     LEFT JOIN global_geografia c ON a.concelho::text = c.id::text
     LEFT JOIN global_geografia d ON a.freguesia::text = d.id::text
     LEFT JOIN global_geografia e ON a.pais::text = e.id::text
     LEFT JOIN global_geografia f ON a.zona::text = f.id::text;
