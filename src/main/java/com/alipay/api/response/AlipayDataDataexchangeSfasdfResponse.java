package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayItemGoodsList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.sfasdf response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataexchangeSfasdfResponse extends AlipayResponse {

	private static final long serialVersionUID = 8657439941492114954L;

	/** 
	 * dsfagshdj
	 */
	@ApiListField("azxfghd")
	@ApiField("string")
	private List<String> azxfghd;

	/** 
	 * asghdfsdas阿福故事、
	 */
	@ApiListField("gfdhsdasafg")
	@ApiField("string")
	private List<String> gfdhsdasafg;

	/** 
	 * fgdhjdsfgh
	 */
	@ApiListField("gfhjfdsa")
	@ApiField("string")
	private List<String> gfhjfdsa;

	/** 
	 * sdfdhgjfdfsaghjfd
	 */
	@ApiListField("ghjfdsafgh")
	@ApiField("string")
	private List<String> ghjfdsafgh;

	/** 
	 * sadasff
	 */
	@ApiField("sdvsdv")
	private String sdvsdv;

	/** 
	 * hysasd
	 */
	@ApiListField("wrty")
	@ApiField("alipay_item_goods_list")
	private List<AlipayItemGoodsList> wrty;

	public void setAzxfghd(List<String> azxfghd) {
		this.azxfghd = azxfghd;
	}
	public List<String> getAzxfghd( ) {
		return this.azxfghd;
	}

	public void setGfdhsdasafg(List<String> gfdhsdasafg) {
		this.gfdhsdasafg = gfdhsdasafg;
	}
	public List<String> getGfdhsdasafg( ) {
		return this.gfdhsdasafg;
	}

	public void setGfhjfdsa(List<String> gfhjfdsa) {
		this.gfhjfdsa = gfhjfdsa;
	}
	public List<String> getGfhjfdsa( ) {
		return this.gfhjfdsa;
	}

	public void setGhjfdsafgh(List<String> ghjfdsafgh) {
		this.ghjfdsafgh = ghjfdsafgh;
	}
	public List<String> getGhjfdsafgh( ) {
		return this.ghjfdsafgh;
	}

	public void setSdvsdv(String sdvsdv) {
		this.sdvsdv = sdvsdv;
	}
	public String getSdvsdv( ) {
		return this.sdvsdv;
	}

	public void setWrty(List<AlipayItemGoodsList> wrty) {
		this.wrty = wrty;
	}
	public List<AlipayItemGoodsList> getWrty( ) {
		return this.wrty;
	}

}
