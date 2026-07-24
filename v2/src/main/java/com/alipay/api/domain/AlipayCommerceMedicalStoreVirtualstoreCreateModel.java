package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建虚拟门店
 *
 * @author auto create
 * @since 1.0, 2026-04-24 18:02:46
 */
public class AlipayCommerceMedicalStoreVirtualstoreCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8147736386296945545L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 好大夫医生doctorId
	 */
	@ApiField("hdf_space_code")
	private String hdfSpaceCode;

	/**
	 * 团队领衔spaceId
	 */
	@ApiField("hdf_space_leader_code")
	private String hdfSpaceLeaderCode;

	/**
	 * 好大夫医生用户名
	 */
	@ApiField("hdf_space_user_name")
	private String hdfSpaceUserName;

	/**
	 * 好大夫主体编码
	 */
	@ApiField("hdf_subject_code")
	private String hdfSubjectCode;

	/**
	 * 好大夫主体名称
	 */
	@ApiField("hdf_subject_name")
	private String hdfSubjectName;

	/**
	 * 好大夫主体类型
	 */
	@ApiField("hdf_subject_type")
	private String hdfSubjectType;

	/**
	 * 商家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getHdfSpaceCode() {
		return this.hdfSpaceCode;
	}
	public void setHdfSpaceCode(String hdfSpaceCode) {
		this.hdfSpaceCode = hdfSpaceCode;
	}

	public String getHdfSpaceLeaderCode() {
		return this.hdfSpaceLeaderCode;
	}
	public void setHdfSpaceLeaderCode(String hdfSpaceLeaderCode) {
		this.hdfSpaceLeaderCode = hdfSpaceLeaderCode;
	}

	public String getHdfSpaceUserName() {
		return this.hdfSpaceUserName;
	}
	public void setHdfSpaceUserName(String hdfSpaceUserName) {
		this.hdfSpaceUserName = hdfSpaceUserName;
	}

	public String getHdfSubjectCode() {
		return this.hdfSubjectCode;
	}
	public void setHdfSubjectCode(String hdfSubjectCode) {
		this.hdfSubjectCode = hdfSubjectCode;
	}

	public String getHdfSubjectName() {
		return this.hdfSubjectName;
	}
	public void setHdfSubjectName(String hdfSubjectName) {
		this.hdfSubjectName = hdfSubjectName;
	}

	public String getHdfSubjectType() {
		return this.hdfSubjectType;
	}
	public void setHdfSubjectType(String hdfSubjectType) {
		this.hdfSubjectType = hdfSubjectType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
