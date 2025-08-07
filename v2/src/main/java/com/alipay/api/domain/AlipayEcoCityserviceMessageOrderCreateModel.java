package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业消息订单接口
 *
 * @author auto create
 * @since 1.0, 2024-04-17 12:56:02
 */
public class AlipayEcoCityserviceMessageOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8176672544251163454L;

	/**
	 * 提供预约/取号功能服务路径页面地址，具体请联系支付宝业务经理
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 证件号,须做md5处理后传输,示例中值的明文为310101198011110010.
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 城市编码，具体参考 中华人民共和国民政部行政编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 加密方式
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 办事附加信息
	 */
	@ApiField("ext_info")
	private MsgOrderExtInfo extInfo;

	/**
	 * 具体的办事列表
	 */
	@ApiListField("goods_info_list")
	@ApiField("msg_order_goods_info_list")
	private List<MsgOrderGoodsInfoList> goodsInfoList;

	/**
	 * 行业编号，具体请联系支付宝业务经理
	 */
	@ApiField("industry_id")
	private String industryId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预约事项办件量
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 格式要求：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 1.订单状态更新时必须更新此时间
2.格式要求：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_update_time")
	private Date orderUpdateTime;

	/**
	 * 确保办事（预约/取号）业务订单号唯一，但同一次办事业务订单号在不同的状态下不能改变且APPID维度下唯一。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 办件量
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 取号方式
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 业务订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 办事预约/取号的订单详情页链接。
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 模板编号，具体请联系支付宝业务经理
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public MsgOrderExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MsgOrderExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public List<MsgOrderGoodsInfoList> getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(List<MsgOrderGoodsInfoList> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public String getIndustryId() {
		return this.industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderUpdateTime() {
		return this.orderUpdateTime;
	}
	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
