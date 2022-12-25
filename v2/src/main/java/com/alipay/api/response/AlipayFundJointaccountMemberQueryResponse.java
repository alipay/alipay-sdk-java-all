package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountMemberRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:42:57
 */
public class AlipayFundJointaccountMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7889812289422585317L;

	/** 
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 成员列表
	 */
	@ApiListField("member_list")
	@ApiField("joint_account_member_resp_d_t_o")
	private List<JointAccountMemberRespDTO> memberList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 页面记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setMemberList(List<JointAccountMemberRespDTO> memberList) {
		this.memberList = memberList;
	}
	public List<JointAccountMemberRespDTO> getMemberList( ) {
		return this.memberList;
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

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
