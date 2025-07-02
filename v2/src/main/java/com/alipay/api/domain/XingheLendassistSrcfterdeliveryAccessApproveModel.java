package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政企团购分期终端交付审核
 *
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:21
 */
public class XingheLendassistSrcfterdeliveryAccessApproveModel extends AlipayObject {

	private static final long serialVersionUID = 4843791862433429663L;

	/**
	 * 是否代收标识，NOT_COLLECTION-非代收 、COLLECTION-代收
	 */
	@ApiField("collection_flag")
	private String collectionFlag;

	/**
	 * 设备代收人身份证号
	 */
	@ApiField("collector_id_card")
	private String collectorIdCard;

	/**
	 * 设备代收人的姓名
	 */
	@ApiField("collector_name")
	private String collectorName;

	/**
	 * 设备代收人手机号
	 */
	@ApiField("collector_phone")
	private String collectorPhone;

	/**
	 * 政企员工团购分期授信初审的申请单号
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 平台为接入客户分配
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 唯一标识政企员工团购分期终端交付请求
	 */
	@ApiField("out_bsn_no")
	private String outBsnNo;

	/**
	 * 业务所属产品，平台为业务分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 文件上传接口上传收货确认书成功后返回的文件id
	 */
	@ApiField("receipt_con_file_id")
	private String receiptConFileId;

	/**
	 * 政企员工的身份证号
	 */
	@ApiField("user_id_card")
	private String userIdCard;

	/**
	 * 政企员工的姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 政企员工名下手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getCollectionFlag() {
		return this.collectionFlag;
	}
	public void setCollectionFlag(String collectionFlag) {
		this.collectionFlag = collectionFlag;
	}

	public String getCollectorIdCard() {
		return this.collectorIdCard;
	}
	public void setCollectorIdCard(String collectorIdCard) {
		this.collectorIdCard = collectorIdCard;
	}

	public String getCollectorName() {
		return this.collectorName;
	}
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}

	public String getCollectorPhone() {
		return this.collectorPhone;
	}
	public void setCollectorPhone(String collectorPhone) {
		this.collectorPhone = collectorPhone;
	}

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getOutBsnNo() {
		return this.outBsnNo;
	}
	public void setOutBsnNo(String outBsnNo) {
		this.outBsnNo = outBsnNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getReceiptConFileId() {
		return this.receiptConFileId;
	}
	public void setReceiptConFileId(String receiptConFileId) {
		this.receiptConFileId = receiptConFileId;
	}

	public String getUserIdCard() {
		return this.userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
