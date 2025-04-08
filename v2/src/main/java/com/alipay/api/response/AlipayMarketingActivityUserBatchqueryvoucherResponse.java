package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.user.batchqueryvoucher response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 15:38:52
 */
public class AlipayMarketingActivityUserBatchqueryvoucherResponse extends AlipayResponse {

	private static final long serialVersionUID = 1471669796659297992L;

	/** 
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询单页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 用户券实例
	 */
	@ApiListField("user_voucher_infos")
	@ApiField("user_voucher_info")
	private List<UserVoucherInfo> userVoucherInfos;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setUserVoucherInfos(List<UserVoucherInfo> userVoucherInfos) {
		this.userVoucherInfos = userVoucherInfos;
	}
	public List<UserVoucherInfo> getUserVoucherInfos( ) {
		return this.userVoucherInfos;
	}

}
