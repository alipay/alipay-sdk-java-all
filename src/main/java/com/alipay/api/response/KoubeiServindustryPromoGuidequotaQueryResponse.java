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
 * @since 1.0, 2020-03-10 10:35:08
 */
public class KoubeiServindustryPromoGuidequotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3526133548244492643L;

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
