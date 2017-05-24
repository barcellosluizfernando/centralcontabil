TYPE=VIEW
query=select `a`.`nome_empresa` AS `nome_empresa`,`a`.`id_empresa` AS `id_empresa`,`a`.`nome_estabelecimento` AS `nome_estabelecimento`,`a`.`id_departamento` AS `id_departamento`,`a`.`nome_departamento` AS `nome_departamento`,`a`.`id_tipo` AS `id_tipo`,`a`.`nome_tipo` AS `nome_tipo`,`a`.`completa` AS `completa`,`a`.`id_estabelecimento` AS `id_estabelecimento`,`a`.`data_impressao` AS `data_impressao`,`a`.`id` AS `id_etiqueta`,`a`.`sequencia` AS `sequencia`,`aa`.`id` AS `id_1`,`aa`.`nome_assunto` AS `nome_assunto_1`,`aa`.`data_inicial` AS `data_inicial_1`,`aa`.`data_final` AS `data_final_1`,`aa2`.`id` AS `id_2`,`aa2`.`nome_assunto` AS `nome_assunto_2`,`aa2`.`data_inicial` AS `data_inicial_2`,`aa2`.`data_final` AS `data_final_2`,`aa3`.`id` AS `id_3`,`aa3`.`nome_assunto` AS `nome_assunto_3`,`aa3`.`data_inicial` AS `data_inicial_3`,`aa3`.`data_final` AS `data_final_3`,`aa4`.`id` AS `id_4`,`aa4`.`nome_assunto` AS `nome_assunto_4`,`aa4`.`data_inicial` AS `data_inicial_4`,`aa4`.`data_final` AS `data_final_4` from (((((`controladoria`.`cad_arquivo_pastas` `a` left join `controladoria`.`rel_arquivo_controle` `c` on((`c`.`id_pasta` = `a`.`id`))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa` on(((`aa`.`sequencia` = `a`.`sequencia`) and (`aa`.`id_empresa` = `a`.`id_empresa`) and (`aa`.`id_departamento` = `a`.`id_departamento`) and (`aa`.`id` = `c`.`maior_id`)))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa2` on(((`aa2`.`sequencia` = `a`.`sequencia`) and (`aa2`.`id_empresa` = `a`.`id_empresa`) and (`aa2`.`id_departamento` = `a`.`id_departamento`) and (`aa2`.`id` = (`c`.`maior_id` - 1))))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa3` on(((`aa3`.`sequencia` = `a`.`sequencia`) and (`aa3`.`id_empresa` = `a`.`id_empresa`) and (`aa3`.`id_departamento` = `a`.`id_departamento`) and (`aa3`.`id` = (`c`.`maior_id` - 2))))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa4` on(((`aa4`.`sequencia` = `a`.`sequencia`) and (`aa4`.`id_empresa` = `a`.`id_empresa`) and (`aa4`.`id_departamento` = `a`.`id_departamento`) and (`aa4`.`id` = (`c`.`maior_id` - 3)))))
md5=d3be230c613fa5f3a840745dcbbcbadf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2016-10-12 15:23:16
create-version=1
source=SELECT\n	a.nome_empresa AS nome_empresa,\n    a.id_empresa as id_empresa,\n    a.nome_estabelecimento AS nome_estabelecimento,\n    a.id_departamento AS id_departamento,\n    a.nome_departamento AS nome_departamento,\n    a.id_tipo AS id_tipo,\n    a.nome_tipo AS nome_tipo,\n    a.completa AS completa,\n    a.id_estabelecimento AS id_estabelecimento,\n    a.data_impressao AS data_impressao,\n    a.id AS id_etiqueta,\n    a.sequencia as sequencia,\n    aa.id AS id_1,\n    aa.nome_assunto AS nome_assunto_1,\n    aa.data_inicial AS data_inicial_1,\n    aa.data_final AS data_final_1,\n    aa2.id AS id_2,\n    aa2.nome_assunto AS nome_assunto_2,\n    aa2.data_inicial AS data_inicial_2,\n    aa2.data_final AS data_final_2,\n    aa3.id AS id_3,\n    aa3.nome_assunto AS nome_assunto_3,\n    aa3.data_inicial AS data_inicial_3,\n    aa3.data_final AS data_final_3,\n    aa4.id AS id_4,\n    aa4.nome_assunto AS nome_assunto_4,\n    aa4.data_inicial AS data_inicial_4,\n    aa4.data_final AS data_final_4\nFROM\n    cad_arquivo_pastas a\n    \n		LEFT JOIN rel_arquivo_controle c ON (c.id_pasta = a.id)\n    \n        /* PESQUISA ASSUNTO 1*/\n        LEFT JOIN cad_arquivo_pastas_detalhe aa ON (aa.sequencia = a.sequencia\n        AND aa.id_empresa = a.id_empresa\n        AND aa.id_departamento = a.id_departamento\n        AND aa.id = c.maior_id)\n		\n        /*PESQUISA ASSUNTO 2*/\n        LEFT JOIN cad_arquivo_pastas_detalhe aa2 ON (aa2.sequencia = a.sequencia\n        AND aa2.id_empresa = a.id_empresa\n        AND aa2.id_departamento = a.id_departamento\n        AND aa2.id = c.maior_id-1)\n		\n        /*PESQUISA ASSUNTO 3*/\n        LEFT JOIN cad_arquivo_pastas_detalhe aa3 ON (aa3.sequencia = a.sequencia\n        AND aa3.id_empresa = a.id_empresa\n        AND aa3.id_departamento = a.id_departamento\n        AND aa3.id = c.maior_id-2)\n        \n         /*PESQUISA ASSUNTO 4*/\n        LEFT JOIN cad_arquivo_pastas_detalhe aa4 ON (aa4.sequencia = a.sequencia\n        AND aa4.id_empresa = a.id_empresa\n        AND aa4.id_departamento = a.id_departamento\n        AND aa4.id = c.maior_id-3)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `a`.`nome_empresa` AS `nome_empresa`,`a`.`id_empresa` AS `id_empresa`,`a`.`nome_estabelecimento` AS `nome_estabelecimento`,`a`.`id_departamento` AS `id_departamento`,`a`.`nome_departamento` AS `nome_departamento`,`a`.`id_tipo` AS `id_tipo`,`a`.`nome_tipo` AS `nome_tipo`,`a`.`completa` AS `completa`,`a`.`id_estabelecimento` AS `id_estabelecimento`,`a`.`data_impressao` AS `data_impressao`,`a`.`id` AS `id_etiqueta`,`a`.`sequencia` AS `sequencia`,`aa`.`id` AS `id_1`,`aa`.`nome_assunto` AS `nome_assunto_1`,`aa`.`data_inicial` AS `data_inicial_1`,`aa`.`data_final` AS `data_final_1`,`aa2`.`id` AS `id_2`,`aa2`.`nome_assunto` AS `nome_assunto_2`,`aa2`.`data_inicial` AS `data_inicial_2`,`aa2`.`data_final` AS `data_final_2`,`aa3`.`id` AS `id_3`,`aa3`.`nome_assunto` AS `nome_assunto_3`,`aa3`.`data_inicial` AS `data_inicial_3`,`aa3`.`data_final` AS `data_final_3`,`aa4`.`id` AS `id_4`,`aa4`.`nome_assunto` AS `nome_assunto_4`,`aa4`.`data_inicial` AS `data_inicial_4`,`aa4`.`data_final` AS `data_final_4` from (((((`controladoria`.`cad_arquivo_pastas` `a` left join `controladoria`.`rel_arquivo_controle` `c` on((`c`.`id_pasta` = `a`.`id`))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa` on(((`aa`.`sequencia` = `a`.`sequencia`) and (`aa`.`id_empresa` = `a`.`id_empresa`) and (`aa`.`id_departamento` = `a`.`id_departamento`) and (`aa`.`id` = `c`.`maior_id`)))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa2` on(((`aa2`.`sequencia` = `a`.`sequencia`) and (`aa2`.`id_empresa` = `a`.`id_empresa`) and (`aa2`.`id_departamento` = `a`.`id_departamento`) and (`aa2`.`id` = (`c`.`maior_id` - 1))))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa3` on(((`aa3`.`sequencia` = `a`.`sequencia`) and (`aa3`.`id_empresa` = `a`.`id_empresa`) and (`aa3`.`id_departamento` = `a`.`id_departamento`) and (`aa3`.`id` = (`c`.`maior_id` - 2))))) left join `controladoria`.`cad_arquivo_pastas_detalhe` `aa4` on(((`aa4`.`sequencia` = `a`.`sequencia`) and (`aa4`.`id_empresa` = `a`.`id_empresa`) and (`aa4`.`id_departamento` = `a`.`id_departamento`) and (`aa4`.`id` = (`c`.`maior_id` - 3)))))
