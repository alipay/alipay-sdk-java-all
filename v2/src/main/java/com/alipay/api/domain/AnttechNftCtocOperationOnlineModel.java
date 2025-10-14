package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 藏品上架下架登记
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:06:53
 */
public class AnttechNftCtocOperationOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 6297351544629249827L;

	/**
	 * 被转入用户的支付宝uid或手机号
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * ENABLE_TRANSFER(上架)
UNABLE_TRANSFER(下架)
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 藏品上下降对象
	 */
	@ApiListField("tenant_nft_list")
	@ApiField("tenant_list_nft_d_t_o")
	private List<TenantListNftDTO> tenantNftList;

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<TenantListNftDTO> getTenantNftList() {
		return this.tenantNftList;
	}
	public void setTenantNftList(List<TenantListNftDTO> tenantNftList) {
		this.tenantNftList = tenantNftList;
	}

}
