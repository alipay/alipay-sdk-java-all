package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV机具申请
 *
 * @author auto create
 * @since 1.0, 2018-10-09 11:55:09
 */
public class AntMerchantExpandIsvDeviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4316871456111596589L;

	/**
	 * 机具使用的业务场景：目前只支持团餐：CATERING_DEVICE
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 渠道商下的服务商pid，例如云纵名下服务商
	 */
	@ApiField("channel_isv_pid")
	private String channelIsvPid;

	/**
	 * 机具物流配送信息
	 */
	@ApiField("delivery_info")
	private DeliveryInfo deliveryInfo;

	/**
	 * 申请的机具模板列表
	 */
	@ApiListField("device_list")
	@ApiField("device_apply_template")
	private List<DeviceApplyTemplate> deviceList;

	/**
	 * 申请人联系方式，须是7到12位电话号码
	 */
	@ApiField("operator_contact")
	private String operatorContact;

	/**
	 * 申请人名称，至少需要一个汉字
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 申请原因描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 门店ID，从成功创建门店的通知里获取
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 申请用途详细说明，比如学校名称
	 */
	@ApiField("usage_detail")
	private String usageDetail;

	/**
	 * 机具申请用途，团餐场景取值如下
    PRIMARY_SCHOOL：小学；
    JUNIOR_HIGH_SCHOOL：初中；
    SENIOR_HIGH_SCHOOL：高中；
    SECONDARY_VOCATIONAL_SCHOOL：中职；
    VOCATIONAL_TECHNICAL_COLLEGE：职业技术学院；
    UNIVERSITY：大学；
    
    COMPANY：企业；
    INDUSTRIAL_PARK：园区；
    GOVERNMENT：政府机关；
    HOSPITAL：医院；
    FOOD_COURT：美食广场；
    OTHER：其它；
	 */
	@ApiField("usage_type")
	private String usageType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannelIsvPid() {
		return this.channelIsvPid;
	}
	public void setChannelIsvPid(String channelIsvPid) {
		this.channelIsvPid = channelIsvPid;
	}

	public DeliveryInfo getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public List<DeviceApplyTemplate> getDeviceList() {
		return this.deviceList;
	}
	public void setDeviceList(List<DeviceApplyTemplate> deviceList) {
		this.deviceList = deviceList;
	}

	public String getOperatorContact() {
		return this.operatorContact;
	}
	public void setOperatorContact(String operatorContact) {
		this.operatorContact = operatorContact;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUsageDetail() {
		return this.usageDetail;
	}
	public void setUsageDetail(String usageDetail) {
		this.usageDetail = usageDetail;
	}

	public String getUsageType() {
		return this.usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
