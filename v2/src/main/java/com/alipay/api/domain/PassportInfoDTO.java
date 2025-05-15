package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 官网注册信息
 *
 * @author auto create
 * @since 1.0, 2023-10-08 11:04:47
 */
public class PassportInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3365228877488522292L;

	/**
	 * 账号注册信息
	 */
	@ApiListField("pass_accounts")
	@ApiField("pass_account_d_t_o")
	private List<PassAccountDTO> passAccounts;

	/**
	 * 用户id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 0是商业官网，1是开源官网
	 */
	@ApiField("register_from")
	private String registerFrom;

	/**
	 * 注册时间
	 */
	@ApiField("register_time")
	private Date registerTime;

	public List<PassAccountDTO> getPassAccounts() {
		return this.passAccounts;
	}
	public void setPassAccounts(List<PassAccountDTO> passAccounts) {
		this.passAccounts = passAccounts;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getRegisterFrom() {
		return this.registerFrom;
	}
	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

}
