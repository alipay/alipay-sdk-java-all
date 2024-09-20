package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正文章信息
 *
 * @author auto create
 * @since 1.0, 2024-09-05 15:23:11
 */
public class CaSystemMainBodyRequest extends AlipayObject {

	private static final long serialVersionUID = 3563132316892364263L;

	/**
	 * * 如果用印坐标未知，可根据关键字及出现的次序计算用印座标。 则：传入关键字及出现次序，axisX，axisY无需传入，内部会计算出对应的值,覆盖外部传入的axisX，axisY
如果已知用印坐标，直接传入axisX，axisY。
 则：(axisX，axisY)附近根据locationType，rotateAngle用印
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 关键字类型
1:"当前页"
2:"所有页"
	 */
	@ApiField("key_word_type")
	private Long keyWordType;

	/**
	 * 当传入关键字时，kwIndex不能为空，从1开始，表示第一个命中的关键字
为-1时，表示命中的最后一个关键字
	 */
	@ApiField("kw_index")
	private Long kwIndex;

	/**
	 * 正文章模式
[{"KEY_WORD", "关键字模式"},{"ABSOLUTE_POSITION", "绝对坐标模式"}]
	 */
	@ApiField("main_body_model")
	private String mainBodyModel;

	/**
	 * 签署页码，单位页
	 */
	@ApiField("pos_page")
	private Long posPage;

	/**
	 * 签署区位置横坐标，单位像素。
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标，单位像素。
	 */
	@ApiField("pos_y")
	private Long posY;

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Long getKeyWordType() {
		return this.keyWordType;
	}
	public void setKeyWordType(Long keyWordType) {
		this.keyWordType = keyWordType;
	}

	public Long getKwIndex() {
		return this.kwIndex;
	}
	public void setKwIndex(Long kwIndex) {
		this.kwIndex = kwIndex;
	}

	public String getMainBodyModel() {
		return this.mainBodyModel;
	}
	public void setMainBodyModel(String mainBodyModel) {
		this.mainBodyModel = mainBodyModel;
	}

	public Long getPosPage() {
		return this.posPage;
	}
	public void setPosPage(Long posPage) {
		this.posPage = posPage;
	}

	public Long getPosX() {
		return this.posX;
	}
	public void setPosX(Long posX) {
		this.posX = posX;
	}

	public Long getPosY() {
		return this.posY;
	}
	public void setPosY(Long posY) {
		this.posY = posY;
	}

}
