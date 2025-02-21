package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步产品
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:10:15
 */
public class AlipayDigitalmgmtPunchoutProductSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1647569441199969151L;

	/**
	 * access_product_dtos,用于punchout模式产品同步
	 */
	@ApiListField("access_product_dtos")
	@ApiField("punchout_access_product_d_t_o")
	private List<PunchoutAccessProductDTO> accessProductDtos;

	public List<PunchoutAccessProductDTO> getAccessProductDtos() {
		return this.accessProductDtos;
	}
	public void setAccessProductDtos(List<PunchoutAccessProductDTO> accessProductDtos) {
		this.accessProductDtos = accessProductDtos;
	}

}
