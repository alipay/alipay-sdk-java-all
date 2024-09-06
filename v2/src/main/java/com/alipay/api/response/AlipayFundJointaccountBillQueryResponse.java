package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountBillDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:55
 */
public class AlipayFundJointaccountBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8723568933823112729L;

	/** 
	 * 返回账单列表。账单列表为空时，返回为空
	 */
	@ApiListField("bill_list")
	@ApiField("joint_account_bill_detail_d_t_o")
	private List<JointAccountBillDetailDTO> billList;

	/** 
	 * 场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

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

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public void setBillList(List<JointAccountBillDetailDTO> billList) {
		this.billList = billList;
	}
	public List<JointAccountBillDetailDTO> getBillList( ) {
		return this.billList;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
