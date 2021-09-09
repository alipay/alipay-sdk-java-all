package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IgAuthQuota;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.promo.guidequota.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-01 11:06:42
 */
public class KoubeiServindustryPromoGuidequotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3348529365999284517L;

	/** 
	 * 权限份额
	 */
	@ApiListField("auth_quota")
	@ApiField("ig_auth_quota")
	private List<IgAuthQuota> authQuota;

	public void setAuthQuota(List<IgAuthQuota> authQuota) {
		this.authQuota = authQuota;
	}
	public List<IgAuthQuota> getAuthQuota( ) {
		return this.authQuota;
	}

}
