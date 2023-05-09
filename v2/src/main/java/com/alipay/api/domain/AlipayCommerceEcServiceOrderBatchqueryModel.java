package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询服务订购单列表
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:55:38
 */
public class AlipayCommerceEcServiceOrderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7418726546575717885L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 订购主体ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 订购单ID列表
	 */
	@ApiListField("order_id_list")
	@ApiField("string")
	private List<String> orderIdList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务ID列表
	 */
	@ApiListField("service_id_list")
	@ApiField("string")
	private List<String> serviceIdList;

	/**
	 * 服务类型列表
	 */
	@ApiListField("service_type_list")
	@ApiField("string")
	private List<String> serviceTypeList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<String> getOrderIdList() {
		return this.orderIdList;
	}
	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getServiceIdList() {
		return this.serviceIdList;
	}
	public void setServiceIdList(List<String> serviceIdList) {
		this.serviceIdList = serviceIdList;
	}

	public List<String> getServiceTypeList() {
		return this.serviceTypeList;
	}
	public void setServiceTypeList(List<String> serviceTypeList) {
		this.serviceTypeList = serviceTypeList;
	}

}
