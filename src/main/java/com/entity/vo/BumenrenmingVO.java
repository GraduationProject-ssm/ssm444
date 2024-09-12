package com.entity.vo;

import com.entity.BumenrenmingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 部门任命
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bumenrenming")
public class BumenrenmingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 部门任命编号
     */

    @TableField(value = "bumenrenming_uuid_number")
    private String bumenrenmingUuidNumber;


    /**
     * 老部门
     */

    @TableField(value = "bumenrenming_old_bumen")
    private String bumenrenmingOldBumen;


    /**
     * 老职位
     */

    @TableField(value = "bumenrenming_old_zhiwei")
    private String bumenrenmingOldZhiwei;


    /**
     * 现部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 现职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 任命缘由
     */

    @TableField(value = "bumenrenming_content")
    private String bumenrenmingContent;


    /**
     * 任命时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "renming_time")
    private Date renmingTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：部门任命编号
	 */
    public String getBumenrenmingUuidNumber() {
        return bumenrenmingUuidNumber;
    }


    /**
	 * 获取：部门任命编号
	 */

    public void setBumenrenmingUuidNumber(String bumenrenmingUuidNumber) {
        this.bumenrenmingUuidNumber = bumenrenmingUuidNumber;
    }
    /**
	 * 设置：老部门
	 */
    public String getBumenrenmingOldBumen() {
        return bumenrenmingOldBumen;
    }


    /**
	 * 获取：老部门
	 */

    public void setBumenrenmingOldBumen(String bumenrenmingOldBumen) {
        this.bumenrenmingOldBumen = bumenrenmingOldBumen;
    }
    /**
	 * 设置：老职位
	 */
    public String getBumenrenmingOldZhiwei() {
        return bumenrenmingOldZhiwei;
    }


    /**
	 * 获取：老职位
	 */

    public void setBumenrenmingOldZhiwei(String bumenrenmingOldZhiwei) {
        this.bumenrenmingOldZhiwei = bumenrenmingOldZhiwei;
    }
    /**
	 * 设置：现部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：现部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：现职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：现职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：任命缘由
	 */
    public String getBumenrenmingContent() {
        return bumenrenmingContent;
    }


    /**
	 * 获取：任命缘由
	 */

    public void setBumenrenmingContent(String bumenrenmingContent) {
        this.bumenrenmingContent = bumenrenmingContent;
    }
    /**
	 * 设置：任命时间
	 */
    public Date getRenmingTime() {
        return renmingTime;
    }


    /**
	 * 获取：任命时间
	 */

    public void setRenmingTime(Date renmingTime) {
        this.renmingTime = renmingTime;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
