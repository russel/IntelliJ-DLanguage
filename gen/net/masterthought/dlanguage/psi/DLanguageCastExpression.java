// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageCastExpression extends PsiElement {

  @NotNull
  DLanguageType getType();

  @Nullable
  DLanguageTypeCtors getTypeCtors();

  @NotNull
  List<DLanguageUnaryExpression> getUnaryExpressionList();

}
