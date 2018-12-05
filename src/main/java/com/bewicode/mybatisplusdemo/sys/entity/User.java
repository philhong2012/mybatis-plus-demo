package com.bewicode.mybatisplusdemo.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author hongxubing
 * @since 2018-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYS_USER")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value="ID",type= IdType.ID_WORKER_STR)
    private String id;

    /**
     * 帐号
     */
    @TableField("ACCOUNT")
    private String account;

    /**
     * 姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 身份证号码
     */
    @TableField("IDCARD")
    private String idcard;

    /**
     * 性别(来源字典)ID
     */
    @TableField("SEX")
    private String sex;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    @TableField("LASTMODIFY_TIME")
    private LocalDateTime lastmodifyTime;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态(来源字典)ID
     */
    @TableField("STATUS")
    private String status;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DAY")
    private LocalDateTime birthDay;

    /**
     * 籍贯
     */
    @TableField("NATIVE_PLACE")
    private String nativePlace;

    /**
     * 创建人ID
     */
    @TableField("CREATE_BY_USERID")
    private String createByUserid;

    /**
     * 最后修改人ID
     */
    @TableField("LASTMODIFY_BY_USERID")
    private String lastmodifyByUserid;

    /**
     * 警号
     */
    @TableField("POLICE_NUMBER")
    private String policeNumber;

    /**
     * 职务 (来源字典)ID
     */
    @TableField("POST")
    private String post;

    /**
     * 工作部门ID(来源sys_org_id)
     */
    @TableField("WORK_DEPT_ID")
    private String workDeptId;

    /**
     * 所属机构Id(来源sys_org_id)
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 编制所在部门ID(来源sys_org_id)
     */
    @TableField("COMPILE_DEPT_ID")
    private String compileDeptId;

    /**
     * 昵称
     */
    @TableField("NICKNAME")
    private String nickname;

    /**
     * 工作证号
     */
    @TableField("WORK_NUMBER")
    private String workNumber;

    /**
     * 行政级别 (来源字典)ID
     */
    @TableField("ADMIN_LEVEL_ID")
    private String adminLevelId;

    /**
     * 警衔(来源字典)ID
     */
    @TableField("POLICE_RANK_ID")
    private String policeRankId;

    /**
     * 编制(来源字典)ID
     */
    @TableField("COMPILE_ID")
    private String compileId;

    /**
     * 最高学历 (来源字典)ID
     */
    @TableField("EDUCATION_ID")
    private String educationId;

    /**
     * 民族 (来源字典)ID
     */
    @TableField("NATION_ID")
    private String nationId;

    /**
     * 政治面貌 (来源字典)ID
     */
    @TableField("POLITICAL_ID")
    private String politicalId;

    /**
     * 职级 (来源字典)ID
     */
    @TableField("RANK_ID")
    private String rankId;

    /**
     * 排序
     */
    @TableField("SORT")
    private String sort;

    /**
     * 移动电话
     */
    @TableField("MOBILE")
    private String mobile;

    /**
     * MSN地址
     */
    @TableField("MSN")
    private String msn;

    /**
     * 办公短号
     */
    @TableField("PHONE2")
    private String phone2;

    /**
     * 移动电话2
     */
    @TableField("MOBILE2")
    private String mobile2;

    /**
     * EMail地址
     */
    @TableField("EMAIL")
    private String email;

    /**
     * qq号码
     */
    @TableField("QQ")
    private String qq;

    /**
     * 办公电话
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 年龄
     */
    @TableField("AGE")
    private String age;

    /**
     * 其他职务
     */
    @TableField("CLIENT")
    private String client;

    /**
     * 电话--区号
     */
    @TableField("AREA_CODE")
    private String areaCode;

    /**
     * 0表示未更新，1表示有更新
     */
    @TableField("UPDATE_STATES")
    private String updateStates;

    /**
     * 原排序
     */
    @TableField("OLD_SORT")
    private String oldSort;

    /**
     * 户籍
     */
    @TableField("HOUSEHOLD_REGISTER")
    private String householdRegister;

    /**
     * 账号简写
     */
    @TableField("SHORT_ACCOUNT")
    private String shortAccount;

    /**
     * 用户相片
     */
    @TableField("PHOTO")
    private String photo;

    /**
     * 微信号
     */
    @TableField("WECHAT")
    private String wechat;

    /**
     * RTX账号
     */
    @TableField("RTXNO")
    private String rtxno;

    /**
     * EMail地址2
     */
    @TableField("EMAIL2")
    private String email2;

    /**
     * 传真
     */
    @TableField("FAX")
    private String fax;

    /**
     * 邮编
     */
    @TableField("POSTCODE")
    private String postcode;

    /**
     * 毕业院校
     */
    @TableField("COLLEGE")
    private String college;

    /**
     * 专业
     */
    @TableField("MAJOR")
    private String major;

    /**
     * 学位
     */
    @TableField("DEGREE")
    private String degree;

    /**
     * 最后修改密码时间
     */
    @TableField("MOD_PWD_TIME")
    private LocalDateTime modPwdTime;

    /**
     * 创建人名称
     */
    @TableField("CREATE_BY_USERNAME")
    private String createByUsername;

    /**
     * 最后修改人名称
     */
    @TableField("LASTMODIFY_BY_USERNAME")
    private String lastmodifyByUsername;

    /**
     * 人员编码
     */
    @TableField("CODE")
    private String code;

    /**
     * 工作部门ID(来源sys_org_id)
     */
    @TableField("WORK_DEPTID")
    private String workDeptid;

    /**
     * 关联Jcis 用户 Id
     */
    @TableField("JCIS_SYS_USER_ID")
    private String jcisSysUserId;

    /**
     * 姓名拼音
     */
    @TableField("NAMEPY")
    private String namepy;

    /**
     * 姓名拼音首字母
     */
    @TableField("NAMEPYFIRST")
    private String namepyfirst;

    @TableField("MIGARTE_FROM")
    private String migarteFrom;

    /**
     * 卡号
     */
    @TableField("CARDNO")
    private String cardno;


}
