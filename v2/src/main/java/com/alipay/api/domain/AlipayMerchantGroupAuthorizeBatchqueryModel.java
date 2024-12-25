package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询授权记录列表
 *
 * @author auto create
 * @since 1.0, 2024-09-11 15:36:10
 */
public class AlipayMerchantGroupAuthorizeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8314825586217115335L;

	/**
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页最大条数，支持最大100条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 授权类型，不传查所有类型的数据，目前只支持 GROUP_INSTANCE_ADMIN(管理商家的支付宝粉丝群)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户名称（真实姓名）。
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
