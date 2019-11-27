package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户维度券和DM信息模型
 *
 * @author auto create
 * @since 1.0, 2017-09-25 11:05:22
 */
public class InstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 6245725999628286796L;

	/**
	 * 是否自动领取
	 */
	@ApiField("auto_obtain")
	private Boolean autoObtain;

	/**
	 * 券或者DM内容，根据同级的type字段可以判断是券还是DM，json格式内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 券或者DM失效时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 券或者DM开始生效时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 券或者DM的图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 券或者DM的id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 券或者DM名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/**
	 * 是否是单品券
	 */
	@ApiField("single")
	private Boolean single;

	/**
	 * 状态 初始化INIT、生效EFFECTIVE、失效INVALID
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券的子类型，代金CASH、兑换券EXCHANGE、折扣券DISCOUNT、买送BUY_SEND、随机减RANDOM_REDUCE
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 券或者DM类型(VOUCHER/DM)
	 */
	@ApiField("type")
	private String type;

	public Boolean getAutoObtain() {
		return this.autoObtain;
	}
	public void setAutoObtain(Boolean autoObtain) {
		this.autoObtain = autoObtain;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceName() {
		return this.instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public Boolean getSingle() {
		return this.single;
	}
	public void setSingle(Boolean single) {
		this.single = single;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
