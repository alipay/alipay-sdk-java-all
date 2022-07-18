package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ServicePromoBaseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-21 14:42:03
 */
public class AlipayOpenAppServicePromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1296314825487347281L;

	/** 
	 * 编辑中版本的服务场景素材详情
	 */
	@ApiField("editing_service_promo")
	private ServicePromoBaseVO editingServicePromo;

	/** 
	 * 生效版本的服务场景素材详情
	 */
	@ApiField("valid_service_promo")
	private ServicePromoBaseVO validServicePromo;

	public void setEditingServicePromo(ServicePromoBaseVO editingServicePromo) {
		this.editingServicePromo = editingServicePromo;
	}
	public ServicePromoBaseVO getEditingServicePromo( ) {
		return this.editingServicePromo;
	}

	public void setValidServicePromo(ServicePromoBaseVO validServicePromo) {
		this.validServicePromo = validServicePromo;
	}
	public ServicePromoBaseVO getValidServicePromo( ) {
		return this.validServicePromo;
	}

}
