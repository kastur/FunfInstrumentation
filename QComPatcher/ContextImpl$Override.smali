.class final Landroid/app/ContextImpl$Override;
.super Landroid/app/ContextImpl$ServiceFetcher;
.source "ContextImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/app/ContextImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 415
    invoke-direct {p0}, Landroid/app/ContextImpl$ServiceFetcher;-><init>()V

    return-void
.end method


# virtual methods
.method public createService(Landroid/app/ContextImpl;)Ljava/lang/Object;
    .locals 2
    .parameter "ctx"

    .prologue
    .line 417
    new-instance v0, Landroid/location/OverrideLocationManager;

    invoke-direct {v0, p1}, Landroid/location/OverrideLocationManager;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
