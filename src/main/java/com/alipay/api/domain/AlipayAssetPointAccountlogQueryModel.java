package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户集分宝流水明细查询
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:35:43
 */
public class AlipayAssetPointAccountlogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2478235674158553725L;

	/**
	 * 用户流水查询起始时间
	 */
	@ApiField("account_date_begin")
	private Date accountDateBegin;

	/**
	 * 用户流水查询结束时间
	 */
	@ApiField("account_date_end")
	private Date accountDateEnd;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页查询的单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 子交易代码，标记大业务下的子业务，例如充值－外部商户发放，可选参数可以不传
	 */
	@ApiListField("sub_trans_code")
	@ApiField("string")
	private List<String> subTransCode;

	/**
	 * 主交易代码,例如支付、充值等，标记业务大类，可选参数可以不传
	 */
	@ApiListField("trans_code")
	@ApiField("string")
	private List<String> transCode;

	/**
	 * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
	 */
	@ApiField("user_symbol")
	private String userSymbol;

	/**
	 * 用户标识符类型，
现在支持ALIPAY_USER_ID:表示支付宝用户ID,
ALIPAY_LOGON_ID:表示支付宝登陆号,
	 */
	@ApiField("user_symbol_type")
	private String userSymbolType;

	public Date getAccountDateBegin() {
		return this.accountDateBegin;
	}
	public void setAccountDateBegin(Date accountDateBegin) {
		this.accountDateBegin = accountDateBegin;
	}

	public Date getAccountDateEnd() {
		return this.accountDateEnd;
	}
	public void setAccountDateEnd(Date accountDateEnd) {
		this.accountDateEnd = accountDateEnd;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getSubTransCode() {
		return this.subTransCode;
	}
	public void setSubTransCode(List<String> subTransCode) {
		this.subTransCode = subTransCode;
	}

	public List<String> getTransCode() {
		return this.transCode;
	}
	public void setTransCode(List<String> transCode) {
		this.transCode = transCode;
	}

	public String getUserSymbol() {
		return this.userSymbol;
	}
	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}

	public String getUserSymbolType() {
		return this.userSymbolType;
	}
	public void setUserSymbolType(String userSymbolType) {
		this.userSymbolType = userSymbolType;
	}

}
