package org.ndexbio.cx2.converter;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ndexbio.cx2.aspect.element.core.FontFace;

public class FontFaceConverterTest {

	@Test
	public void test() {
	
					
		String testFontString = "Arial Italic";
		FontFace f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SANS_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.ITALIC, f.getStyle());
		assertEquals (FontFace.NORMAL, f.getWeight());
		
		testFontString = "Bookman Old Style Bold";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SANS_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.NORMAL, f.getStyle());
		assertEquals (FontFace.BOLD, f.getWeight());
		
		testFontString = "AvenirNext-BoldItalic";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SANS_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.ITALIC, f.getStyle());
		assertEquals (FontFace.BOLD, f.getWeight());

		testFontString = "Lucida Console";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_MONOSPACE_FONT, f.getFamily());
		assertEquals ( FontFace.NORMAL, f.getStyle());
		assertEquals (FontFace.NORMAL, f.getWeight());

		testFontString = "Perpetua";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.NORMAL, f.getStyle());
		assertEquals (FontFace.NORMAL, f.getWeight());

		testFontString = "Dialog.bold";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SANS_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.NORMAL, f.getStyle());
		assertEquals (FontFace.BOLD, f.getWeight());

		testFontString = "Arial Bold Italic";
	    f = FontFaceConverter.convertFont(testFontString);
		
		assertEquals ( FontFace.PORTABLE_SANS_SERIF_FONT, f.getFamily());
		assertEquals ( FontFace.ITALIC, f.getStyle());
		assertEquals (FontFace.BOLD, f.getWeight());
		
	}	
		
		
}
