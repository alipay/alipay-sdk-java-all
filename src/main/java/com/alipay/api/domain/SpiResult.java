package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SPI初始化返回对象
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:44:57
 */
public class SpiResult extends AlipayObject {

	private static final long serialVersionUID = 8881434687618989183L;

	/**
	 * isv自定义业务代码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * spi唯一id
	 */
	@ApiField("spi_id")
	private Long spiId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Long getSpiId() {
		return this.spiId;
	}
	public void setSpiId(Long spiId) {
		this.spiId = spiId;
	}

}
