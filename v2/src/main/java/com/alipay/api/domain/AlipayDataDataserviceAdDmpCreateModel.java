package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备数据人群包创建
 *
 * @author auto create
 * @since 1.0, 2025-08-04 19:02:04
 */
public class AlipayDataDataserviceAdDmpCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1253326787863465743L;

	/**
	 * 支付宝统一编码，2088开头字符串。人群包创建人id
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 行为分类标签
	 */
	@ApiListField("behavior_types")
	@ApiField("string")
	private List<String> behaviorTypes;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 非必传，创建人群后接口会返回创建成功的人群包编码。更新操作时该人群包编码必传
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 创建或更新人群时需传入的人群包名称，人群包名称最长不超过30
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 设备数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 设备号数据，元素个数不能超过5000
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * 人群包有效日期的结束时间，结束时间不能小于开始时间。
	 */
	@ApiField("expiry_time")
	private Date expiryTime;

	/**
	 * 是否上传完成标识。设备号数据分批次上传时最后一个批次为true，其他批次为false。
	 */
	@ApiField("if_end")
	private Boolean ifEnd;

	/**
	 * 人群包有效期的开始时间，开始时间不能小于当前时间，且开始时间不能大于结束时间。
	 */
	@ApiField("open_time")
	private Date openTime;

	/**
	 * 操作类型，每次操作必传
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 商家在灯火的唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 调用接口创建或更新人群包时需生成的唯一的操作id，不受设备号数据分批次影响。如2000条数据分两批次上传，本次操作两批次的uuid保持一致
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public List<String> getBehaviorTypes() {
		return this.behaviorTypes;
	}
	public void setBehaviorTypes(List<String> behaviorTypes) {
		this.behaviorTypes = behaviorTypes;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public Date getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public Boolean getIfEnd() {
		return this.ifEnd;
	}
	public void setIfEnd(Boolean ifEnd) {
		this.ifEnd = ifEnd;
	}

	public Date getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
