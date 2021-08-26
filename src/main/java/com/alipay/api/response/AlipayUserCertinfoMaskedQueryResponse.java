package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MaskedUserCertView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certinfo.masked.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-30 10:13:44
 */
public class AlipayUserCertinfoMaskedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6814984153139818835L;

	/** 
	 * 脱敏后的用户身份信息。【注意】如果入参中某一userId不存在，返回的视图列表中将不包含该userId对应视图。（举例：入参里10个userId，其中1个userId不存在，则出参列表里有9个视图）
	 */
	@ApiListField("cert_views")
	@ApiField("masked_user_cert_view")
	private List<MaskedUserCertView> certViews;

	public void setCertViews(List<MaskedUserCertView> certViews) {
		this.certViews = certViews;
	}
	public List<MaskedUserCertView> getCertViews( ) {
		return this.certViews;
	}

}
