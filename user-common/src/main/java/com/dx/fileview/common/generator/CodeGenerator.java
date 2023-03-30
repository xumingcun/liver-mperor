package com.dx.fileview.common.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 *
 * @author xmc
 * @version 1.0
 * @date 2023/3/25 11:07:08
 * @since jdk17
 */
public class CodeGenerator {
    public static void main(String[] args) {
        List<String> tables = new ArrayList<>();
        tables.add("sys_clan");
        tables.add("sys_genealog");
        tables.add("sys_hierarchy");
        tables.add("sys_home");
        tables.add("sys_relation");
        tables.add("sys_user");
        // 数据源配置
        FastAutoGenerator.create("jdbc:mysql://192.168.1.150:3306/life_circle?useUnicode=true&zeroDateTimeBehavior=convertToNull&autoReconnect=true&&characterEncoding=utf-8&useSSL=false",
                        "root", "123456")
//                .dataSourceConfig(builder -> {
//                    builder.dbQuery(new MySqlQuery())
//                            .schema("mybatis-plus")
//                            .typeConvert(new MySqlTypeConvert())
//                            .keyWordsHandler(new MySqlKeyWordsHandler())
//                            .build();
//                })
                .globalConfig(builder -> {
                    builder.author("xmc")        // 设置作者
//                            .enableSwagger()        // 开启 swagger 模式 默认值:false
                            .disableOpenDir()       // 禁止打开输出目录 默认值:true
                            .commentDate("yyyy-MM-dd") // 注释日期
                            .dateType(DateType.ONLY_DATE)   //定义生成的实体类中日期类型 DateType.ONLY_DATE 默认值: DateType.TIME_PACK
                            .outputDir("D:\\project\\liver-mperor\\user-server"+ "/src/main/java")// 指定输出目录
                    ;
                })
                .packageConfig(builder -> {
                    builder.parent("com.dx.fileview.server")
//                            .moduleName("user-server")
                            .entity("bean")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller");
                }).strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .formatMapperFileName("%sMapper")
                            .formatXmlFileName("%sXml")
                            .enableFileOverride();//删除已存在的
                }).templateConfig(builder -> {
                    builder.disable(TemplateType.ENTITY)
                            .entity("/templates/entity.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .controller("/templates/controller.java")
                            .xml("/templates/mapper.xml")
                    ;
                })
                .injectionConfig(builder -> {

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
