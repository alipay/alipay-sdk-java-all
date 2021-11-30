package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券信息详情
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:04:12
 */
public class PassInstanceDetail extends AlipayObject {

	private static final long serialVersionUID = 4837959363561438389L;

	/**
	 * 业务动态参数列表
	 */
	@ApiListField("biz_param_list")
	@ApiField("biz_param_key_value")
	private List<BizParamKeyValue> bizParamList;

	/**
	 * 所属商户PID/APPID（发放渠道ID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 卡券实例创建时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 有效期-结束时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 删除标记，是否已被用户删除
	 */
	@ApiField("is_deleted")
	private Boolean isDeleted;

	/**
	 * logo图片的ID或链接，模板创建时在模板JSON文本中指定
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 卡券展示标题
	 */
	@ApiField("logo_text")
	private String logoText;

	/**
	 * 最后修改时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 卡券实例id，对应调卡券发放alipay.pass.instance.add接口返回的passId
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * 产品业务类型，模板创建时在模板JSON文本中指定
	 */
	@ApiField("product")
	private String product;

	/**
	 * 卡券单据号
由商户发券时指定的卡券唯一凭证号，卡券JSON模板中fileInfo->serialNumber字段对应的值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 有效期-开始时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 卡券状态：
CAN_USE：可使用；
EXPIRED：已过期；
USED：已使用（已核销）；
CLOSED：已失效；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 图片/海报的图片ID或链接，模板创建时在模板JSON文本中指定
	 */
	@ApiField("strip")
	private String strip;

	/**
	 * 模板ID（编号）
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模板类型，模板创建时在模板JSON文本中指定
	 */
	@ApiField("type")
	private String type;

	/**
	 * 所属用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public List<BizParamKeyValue> getBizParamList() {
		return this.bizParamList;
	}
	public void setBizParamList(List<BizParamKeyValue> bizParamList) {
		this.bizParamList = bizParamList;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogoText() {
		return this.logoText;
	}
	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getPassId() {
		return this.passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrip() {
		return this.strip;
	}
	public void setStrip(String strip) {
		this.strip = strip;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
