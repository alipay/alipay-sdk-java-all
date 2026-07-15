package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单拓展信息
 *
 * @author auto create
 * @since 1.0, 2026-07-03 16:28:44
 */
public class RentOrderExtendInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8631349766529417594L;

	/**
	 * 当前订单用户是否授权静默签署电子合同
	 */
	@ApiField("ec_sign_user_authorized")
	private String ecSignUserAuthorized;

	/**
	 * 已上传电子合同
	 */
	@ApiListField("merchant_upload_contracts")
	@ApiField("rent_merchant_upload_contract_v_o")
	private List<RentMerchantUploadContractVO> merchantUploadContracts;

	/**
	 * 承诺发货时间
	 */
	@ApiField("promised_send_time")
	private Date promisedSendTime;

	/**
	 * 回收订单ID
	 */
	@ApiField("recycle_order_id")
	private String recycleOrderId;

	/**
	 * 租赁派单ID，唯一标识一次派单请求
	 */
	@ApiField("rent_dispatch_id")
	private String rentDispatchId;

	/**
	 * 定义参考 <a href="https://opendocs.alipay.com/mini/0dfcde" target="_blank">公域场景标识</a>
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 芝麻租赁频道联营订单标
	 */
	@ApiField("union_rent_tag")
	private String unionRentTag;

	public String getEcSignUserAuthorized() {
		return this.ecSignUserAuthorized;
	}
	public void setEcSignUserAuthorized(String ecSignUserAuthorized) {
		this.ecSignUserAuthorized = ecSignUserAuthorized;
	}

	public List<RentMerchantUploadContractVO> getMerchantUploadContracts() {
		return this.merchantUploadContracts;
	}
	public void setMerchantUploadContracts(List<RentMerchantUploadContractVO> merchantUploadContracts) {
		this.merchantUploadContracts = merchantUploadContracts;
	}

	public Date getPromisedSendTime() {
		return this.promisedSendTime;
	}
	public void setPromisedSendTime(Date promisedSendTime) {
		this.promisedSendTime = promisedSendTime;
	}

	public String getRecycleOrderId() {
		return this.recycleOrderId;
	}
	public void setRecycleOrderId(String recycleOrderId) {
		this.recycleOrderId = recycleOrderId;
	}

	public String getRentDispatchId() {
		return this.rentDispatchId;
	}
	public void setRentDispatchId(String rentDispatchId) {
		this.rentDispatchId = rentDispatchId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUnionRentTag() {
		return this.unionRentTag;
	}
	public void setUnionRentTag(String unionRentTag) {
		this.unionRentTag = unionRentTag;
	}

}
