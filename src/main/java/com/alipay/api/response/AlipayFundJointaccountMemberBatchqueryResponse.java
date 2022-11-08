package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountMemberDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 14:11:28
 */
public class AlipayFundJointaccountMemberBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2645264824535821922L;

	/** 
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 员工列表
	 */
	@ApiListField("member_list")
	@ApiField("joint_account_member_d_t_o")
	private List<JointAccountMemberDTO> memberList;

	/** 
	 * 当前页数，使用游标方式查询时，没有该字段
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 当前记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private String totalCount;

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

	public void setMemberList(List<JointAccountMemberDTO> memberList) {
		this.memberList = memberList;
	}
	public List<JointAccountMemberDTO> getMemberList( ) {
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

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
