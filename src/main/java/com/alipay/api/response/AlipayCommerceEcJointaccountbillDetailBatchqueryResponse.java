package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.jointaccountbill.detail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 09:48:32
 */
public class AlipayCommerceEcJointaccountbillDetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7834151576856969888L;

	/** 
	 * 返回账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("joint_account_bill_detail")
	private List<JointAccountBillDetail> billList;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 企业ID，和接口入参一致
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 当期页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 当期页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	public void setBillList(List<JointAccountBillDetail> billList) {
		this.billList = billList;
	}
	public List<JointAccountBillDetail> getBillList( ) {
		return this.billList;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

}
