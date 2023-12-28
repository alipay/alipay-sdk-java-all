package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  电影列表
 *
 * @author auto create
 * @since 1.0, 2023-11-15 19:38:58
 */
public class MovieList extends AlipayObject {

	private static final long serialVersionUID = 7559745989512783612L;

	/**
	 * 演员阵容
	 */
	@ApiField("cast")
	private String cast;

	/**
	 * 电影制式
	 */
	@ApiField("copy_types")
	private String copyTypes;

	/**
	 * 海报
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 导演
	 */
	@ApiField("director")
	private String director;

	/**
	 * 电影时长
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 电影编码
	 */
	@ApiField("film_code")
	private String filmCode;

	/**
	 * 电影名称
	 */
	@ApiField("film_name")
	private String filmName;

	/**
	 * 影片 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否为预售
	 */
	@ApiField("is_booking")
	private String isBooking;

	/**
	 * 电影语言
	 */
	@ApiField("language")
	private String language;

	/**
	 * 排期数量
	 */
	@ApiField("plan_count")
	private Long planCount;

	/**
	 * 上映日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 电影简介
	 */
	@ApiField("simple_word")
	private String simpleWord;

	/**
	 * 电影类型
	 */
	@ApiField("type")
	private String type;

	public String getCast() {
		return this.cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCopyTypes() {
		return this.copyTypes;
	}
	public void setCopyTypes(String copyTypes) {
		this.copyTypes = copyTypes;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getFilmCode() {
		return this.filmCode;
	}
	public void setFilmCode(String filmCode) {
		this.filmCode = filmCode;
	}

	public String getFilmName() {
		return this.filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIsBooking() {
		return this.isBooking;
	}
	public void setIsBooking(String isBooking) {
		this.isBooking = isBooking;
	}

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getPlanCount() {
		return this.planCount;
	}
	public void setPlanCount(Long planCount) {
		this.planCount = planCount;
	}

	public String getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getSimpleWord() {
		return this.simpleWord;
	}
	public void setSimpleWord(String simpleWord) {
		this.simpleWord = simpleWord;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
