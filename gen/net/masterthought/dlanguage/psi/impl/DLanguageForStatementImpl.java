// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageForStatementImpl extends ASTWrapperPsiElement implements DLanguageForStatement {

  public DLanguageForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitForStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageIncrement getIncrement() {
    return findChildByClass(DLanguageIncrement.class);
  }

  @Override
  @NotNull
  public DLanguageInitialize getInitialize() {
    return findNotNullChildByClass(DLanguageInitialize.class);
  }

  @Override
  @NotNull
  public DLanguageScopeStatement getScopeStatement() {
    return findNotNullChildByClass(DLanguageScopeStatement.class);
  }

  @Override
  @Nullable
  public DLanguageTest getTest() {
    return findChildByClass(DLanguageTest.class);
  }

  @Override
  @NotNull
  public PsiElement getKwFor() {
    return findNotNullChildByType(KW_FOR);
  }

  @Override
  @NotNull
  public PsiElement getOpParLeft() {
    return findNotNullChildByType(OP_PAR_LEFT);
  }

  @Override
  @NotNull
  public PsiElement getOpParRight() {
    return findNotNullChildByType(OP_PAR_RIGHT);
  }

  @Override
  @NotNull
  public PsiElement getOpScolon() {
    return findNotNullChildByType(OP_SCOLON);
  }

}
